package com.honglekai.study.filterChain;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/7 11:51
 * modifyTime
 */
public interface Filter {

    void doFilter(Request request, Response response,FilterChain chain);
}
