package com.packt.akka.cluster

import akka.cluster._
import commons._
import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import cl.cluster._


object ClusterApp extends App {

  //initiate frontend node
  Frontend.initiate()

  //initiate three nodes from backend
  Backend.initiate(2552)

  Backend.initiate(2560)

  Backend.initiate(2561)

  Thread.sleep(10000)

  Frontend.getFrontend ! Add(2, 4)

}