package com.honglekai.study.dpStrategy.facade;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/31 16:13
 * modifyTime
 */
public class Computer {

    private Cpu cpu;

    private Memory memory;

    private Disk disk;

    public Computer() {
        cpu = new Cpu();
        memory = new Memory();
        disk = new Disk();
    }

    public  void startup(){
        System.out.println("Computer.......startup......");

        cpu.startup();
        memory.startup();
        disk.startup();

    }

    public void shutdown(){
        System.out.println("Computer........shutdown.....");

        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
    }


}
