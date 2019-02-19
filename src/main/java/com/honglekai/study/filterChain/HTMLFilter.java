package com.honglekai.study.filterChain;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/7 13:43
 * modifyTime
 */
public class HTMLFilter implements Filter{


    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.requestStr = request.requestStr.replace('<','[')
                                          .replace('>',']') + "------HTMLFilter()";

        chain.doFilter(request,response,chain);
        response.responseStr += "---HTMLFilter()";

    }
}
