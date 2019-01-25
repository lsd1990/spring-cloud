package com.lsd.rx.java;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

public class RxJavaFlowableDemo {

    public static void main(String args[]){

        Flowable.fromArray(1, 2, 3).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                System.out.println(integer);
            }
        });

        Observable<String> o = Observable.just("one object","one object");

    }
}
