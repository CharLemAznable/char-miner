package com.github.charlemaznable.configservice.etcd.guice;

import com.github.charlemaznable.configservice.etcd.EtcdConfig;
import com.github.charlemaznable.configservice.test.TestWired;

@EtcdConfig("SUB_DATA")
public interface TestWiredSub extends TestWired {
}
