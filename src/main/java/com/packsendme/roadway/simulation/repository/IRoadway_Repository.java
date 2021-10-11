package com.packsendme.roadway.simulation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.packsendme.roadway.commons.response.SimulationRoadwayResponse;

@Repository
public interface IRoadway_Repository extends MongoRepository<SimulationRoadwayResponse, String>{

}

