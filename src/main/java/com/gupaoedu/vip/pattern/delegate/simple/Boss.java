package com.gupaoedu.vip.pattern.delegate.simple;

public class Boss {
    public void doing(String command, Leader leader) {
        leader.doing(command);
    }
}
