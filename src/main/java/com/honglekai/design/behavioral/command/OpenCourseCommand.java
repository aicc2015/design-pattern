package com.honglekai.design.behavioral.command;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/21 11:11
 * modifyTime
 */
public class OpenCourseCommand implements Command {

    private CourseVideo courseVideo;

    public OpenCourseCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        System.out.println("打开课程视频"+courseVideo.getVideoName());
    }
}
