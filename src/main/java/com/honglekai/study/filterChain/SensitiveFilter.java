package com.honglekai.study.filterChain;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/7 14:10
 * modifyTime
 */
public class SensitiveFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.requestStr = request.requestStr.replace("被就业","就业")
                .replace("敏感","")+"------SensitiveFilter()";

        chain.doFilter(request,response,chain);

        response.responseStr += "-------SensitiveFilter()";
    }
}
