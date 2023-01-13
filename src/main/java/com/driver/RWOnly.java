package com.driver;

public class RWOnly {
 private String name="abhi";
 public RWOnly(String name){
  this.name=name;
 }
 public String getName() {
  return name;
 }

 public String setName(String name) {
  this.name = name;
  return name;
 }
}


