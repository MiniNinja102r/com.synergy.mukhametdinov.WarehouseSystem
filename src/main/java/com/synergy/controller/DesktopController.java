package com.synergy.controller;

import com.synergy.entity.ControllerType;

public final class DesktopController implements Controller {

    @Override
    public void run() {
        System.out.println("Запущена программа складского помещения");
    }

    @Override
    public ControllerType type() {
        return ControllerType.DESKTOP;
    }
}
