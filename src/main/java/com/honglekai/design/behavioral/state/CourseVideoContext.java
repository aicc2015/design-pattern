package com.honglekai.design.behavioral.state;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/21 17:29
 * modifyTime
 */
public class CourseVideoContext {

    private CourseVideoState courseVideoState;

    public final static PlayState PLAY_STATE = new PlayState();
    public final static SpeedState SPEED_STATE = new SpeedState();
    public final static PauseState PAUSE_STATE = new PauseState();
    public final static StopState STOP_STATE = new StopState();

    public CourseVideoContext() {
    }


    public void setCourseVideoState(CourseVideoState courseVideoState) {
        this.courseVideoState = courseVideoState;

        //设置当前状态的上下文
        this.courseVideoState.setCourseVideoContext(this);
    }

    public CourseVideoState getCourseVideoState() {
        return courseVideoState;
    }

    public void play(){
        this.courseVideoState.play();
    }


    public void speed(){
        this.courseVideoState.speed();
    }
    public void pause(){
        this.courseVideoState.pause();
    }
    public void stop(){
        this.courseVideoState.stop();
    }
}
