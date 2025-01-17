package me.earth.earthhack.impl.core.ducks.entity;

import me.earth.earthhack.impl.util.minecraft.MotionTracker;

public interface IEntityPlayer {
    void setMotionTracker(MotionTracker motionTracker);

    MotionTracker getMotionTracker();

    void setBreakMotionTracker(MotionTracker motionTracker);

    MotionTracker getBreakMotionTracker();

    int getTicksWithoutMotionUpdate();

    void setTicksWithoutMotionUpdate(int ticksWithoutMotionUpdate);

}
