package com.honglekai.design.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/21 11:13
 * modifyTime
 */
public class Staff {
    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command){
        commandList.add(command);
    }

    public void executeCommands(){
        for (Command command : commandList){
            command.execute();
        }
        commandList.clear();

    }
}
