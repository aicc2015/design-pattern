package com.honglekai.design.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/18 13:54
 * modifyTime
 */
public class EmployeeFactory {

    private static final Map<String,Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String department){
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if (manager == null){
            manager = new Manager(department);

            String reportContent =department + " 部门汇报,此次报告的主要内容是。。。。";
            manager.setReportContent(reportContent);
            System.out.print ("创建部门经理"+department);
            System.out.println (" 创建报告内容"+reportContent);

            EMPLOYEE_MAP.put(department,manager);

        }
        return manager;
    }
}
