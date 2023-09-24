package com.dubuyin.qyoj.judge;

import com.dubuyin.qyoj.judge.codesandbox.model.ExecuteCodeResponse;
import com.dubuyin.qyoj.model.entity.QuestionSubmit;

public interface JudgeService {

    QuestionSubmit doJudge(long questionSubmitId);
}
