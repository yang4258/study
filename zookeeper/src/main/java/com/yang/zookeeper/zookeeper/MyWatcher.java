package com.yang.zookeeper.zookeeper;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;

import java.util.concurrent.CountDownLatch;

public class MyWatcher implements Watcher {
    private CountDownLatch connectedSemaphore;

    public MyWatcher(CountDownLatch connectedSemaphore) {
        this.connectedSemaphore = connectedSemaphore;
    }

    @Override
    public void process(WatchedEvent watchedEvent) {
        System.out.println("Receive watched event: " + watchedEvent);
        if (Event.KeeperState.SyncConnected == watchedEvent.getState()) {
            connectedSemaphore.countDown();
        }
    }
}
