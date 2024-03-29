package com.cwq.springbootcommunity.controller;

import com.cwq.springbootcommunity.dto.NotificationDTO;
import com.cwq.springbootcommunity.dto.PaginationDTO;
import com.cwq.springbootcommunity.enums.NotificationTypeEnum;
import com.cwq.springbootcommunity.model.User;
import com.cwq.springbootcommunity.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author cwq
 * @date 2019/11/12 - 17:03
 */
@Controller
public class NotificationController {
    @Autowired
    private NotificationService notificationService;

    @GetMapping("/notification/{id}")
    public String profile(@PathVariable(name = "id") Long id, HttpServletRequest request) {
        User user = (User)request.getSession().getAttribute("user");
        if(user == null){
            return "redirect:/";
        }

        NotificationDTO notificationDTO =  notificationService.read(id,user);
        if(NotificationTypeEnum.REPLY_COMMENT.getType() == notificationDTO.getType()
                ||(NotificationTypeEnum.REPLY_QUESTION.getType() == notificationDTO.getType())){
            return "redirect:/question/"+notificationDTO.getOuterid();
        }else{
            return "redirect:/";
        }
    }
}
