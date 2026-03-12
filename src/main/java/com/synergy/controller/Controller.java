package com.synergy.controller;

import com.synergy.entity.ControllerType;

public interface Controller {
    void run();
    ControllerType type();
}
