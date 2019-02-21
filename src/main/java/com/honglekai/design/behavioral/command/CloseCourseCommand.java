package com.honglekai.design.behavioral.command;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/21 11:13
 * modifyTime
 */
public class CloseCourseCommand implements Command {

    private CourseVideo courseVideo;


    public CloseCourseCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override

    public void execute() {
        System.out.println("关闭课程视频"+courseVideo.getVideoName());
    }
}
