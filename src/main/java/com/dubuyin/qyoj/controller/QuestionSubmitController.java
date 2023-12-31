package com.dubuyin.qyoj.controller;

import com.dubuyin.qyoj.common.BaseResponse;
import com.dubuyin.qyoj.common.ErrorCode;
import com.dubuyin.qyoj.common.ResultUtils;
import com.dubuyin.qyoj.exception.BusinessException;
import com.dubuyin.qyoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.dubuyin.qyoj.model.entity.User;
import com.dubuyin.qyoj.service.QuestionSubmitService;
import com.dubuyin.qyoj.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/question_submit")
@Slf4j
public class QuestionSubmitController {

    @Resource
    private QuestionSubmitService questionSubmitService;

    @Resource
    private UserService userService;

    /**
     * 点赞 / 取消点赞
     *
     * @param questionSubmitAddRequest
     * @param request
     * @return resultNum 本次点赞变化数
     */
//    @PostMapping("/")
//    public BaseResponse<Integer> doThumb(@RequestBody QuestionSubmitAddRequest questionSubmitAddRequest,
//                                         HttpServletRequest request) {
//        if (questionSubmitAddRequest == null || questionSubmitAddRequest.getPostId() <= 0) {
//            throw new BusinessException(ErrorCode.PARAMS_ERROR);
//        }
//        // 登录才能点赞
//        final User loginUser = userService.getLoginUser(request);
//        long postId = questionSubmitAddRequest.getPostId();
//        int result = questionSubmitService.doQuestionSubmit(postId, loginUser);
//        return ResultUtils.success(result);
//    }

}
