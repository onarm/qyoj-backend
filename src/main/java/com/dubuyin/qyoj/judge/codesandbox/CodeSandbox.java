package com.dubuyin.qyoj.judge.codesandbox;

import com.dubuyin.qyoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.dubuyin.qyoj.judge.codesandbox.model.ExecuteCodeResponse;

public interface CodeSandbox {
    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
