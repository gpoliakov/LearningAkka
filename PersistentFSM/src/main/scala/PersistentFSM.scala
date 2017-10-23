
import Account._
import akka.persistence._
import akka.actor.{Actor, ActorRef, ActorSystem, Props}


object PersistentFSM extends App {


  val system = ActorSystem("persistent-fsm-actors")

  val account = system.actorOf(Props[Account])

  account ! Operation(1000, CR)

  account ! Operation(10, DR)

  Thread.sleep(1000)

  system.terminate()

}






