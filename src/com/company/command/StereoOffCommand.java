package com.company.command;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {

    }

    @Override
    public String toString() {
        return "StereoOffCommand{" +
                "stereo=" + stereo +
                '}';
    }
}
