package com.synergy.controller;

import com.synergy.entity.ControllerType;

public final class WebController implements Controller {

    @Override
    public void run() {
        System.out.println("Запущена веб-версия складского помещения");
    }

    @Override
    public ControllerType type() {
        return ControllerType.WEB;
    }
}
