package scalatips

object AkkaHttp5mins {
    implicit val system = ActorSystem() // akka actors
    implicit val materialise = ActorMaterializer() // akka streams
}