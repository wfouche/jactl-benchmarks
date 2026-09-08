///usr/bin/env jbang "$0" "$@" ; exit $?
//DEPS io.github.tulipltt:tulip-runtime:2.3.6
//SOURCES JactlUser.java
//JAVA 26
//FILES ../../benchmark_config.json
//FILES ../../logback.xml
//RUNTIME_OPTIONS -XX:+IgnoreUnrecognizedVMOptions
//RUNTIME_OPTIONS --enable-native-access=ALL-UNNAMED
//RUNTIME_OPTIONS --sun-misc-unsafe-memory-access=allow
//DEPS io.jactl:jactl:2.9.2
//DEPS org.apache.groovy:groovy:5.1.2
//DEPS com.ezylang:EvalEx:3.7.0
//DEPS org.python:jython-slim:2.7.5b1

package io.tulip;

import io.github.tulipltt.tulip.api.TulipApi;

public class App {
   public static void main(String[] args) {
      TulipApi.generateReport(TulipApi.runTulip("benchmark_config.json"));
   }
}
