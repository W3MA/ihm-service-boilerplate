package com.ihm.boilerplate

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class BoilerplateSimulation extends Simulation {

  val httpConf = http
    .baseURL("http://localhost:8001")

  val scn = scenario("Boilerplate")
    .exec(
      http("GET - /boilerplate")
        .get("/boilerplate")
    ).pause(2 seconds)

  setUp(
    scn.inject(rampUsers(20) over (10 seconds))
  ).protocols(httpConf)
}