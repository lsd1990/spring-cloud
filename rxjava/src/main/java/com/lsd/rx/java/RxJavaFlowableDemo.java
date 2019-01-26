package com.lsd.rx.java;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Consumer;

public class RxJavaFlowableDemo {


    public static void main(String args[]){

        Flowable.fromArray(1, 2, 3).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                System.out.println(integer);
            }
        });




        Flowable.fromArray(1, 2, 3).observeOn(new Scheduler() {
            @Override
            public Worker createWorker() {

                return null;// TODO (lusudong, 2019/1/26)
            }
        }).subscribeOn(new Scheduler() {
            @Override
            public Worker createWorker() {
                return null;// TODO (lusudong, 2019/1/26)
            }
        });

    }
}
