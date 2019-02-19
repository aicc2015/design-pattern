package com.honglekai.design.structural.flyweight;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/18 13:50
 * modifyTime
 */
public class Manager implements Employee {
    @Override
    public void report() {
        System.out.println(reportContent);
    }

    private String title = "部门经理"; //内部状态
    private String department; //外部状态

    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
