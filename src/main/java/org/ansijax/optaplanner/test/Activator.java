/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ansijax.optaplanner.test;

import java.io.File;

import org.optaplanner.core.api.solver.SolverFactory;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	public static final String SOLVER_CONFIG
	="data/solver/vehicleRoutingSolverConfig.xml";
	public void start(BundleContext context) {
		System.out.println("Starting the bundle");


		//uncomment one of the two delcleration of solverFactory
		
		//Test with create from File
		File solverFile = new File(SOLVER_CONFIG);
		SolverFactory solverFactory = SolverFactory.createFromXmlFile(solverFile);

		//Test from resources
//		SolverFactory solverFactory = SolverFactory.createFromXmlResource(SOLVER_CONFIG);
		solverFactory.buildSolver();
		

	}

	public void stop(BundleContext context) {
		System.out.println("Stopping the bundle");
	}

}