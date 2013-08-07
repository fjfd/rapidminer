/*
 *  RapidMiner
 *
 *  Copyright (C) 2001-2013 by Rapid-I and the contributors
 *
 *  Complete list of developers available at our web site:
 *
 *       http://rapid-i.com
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see http://www.gnu.org/licenses/.
 */
package com.rapidminer.tools.math.smoothing;

/**
 * This class implements a triangular smoothing kernel. If distance is 0,
 * the weight is 1, with growing distance the weight will decrease linearly to zero.
 * 
 * @author Sebastian Land
 */
public class TriangularSmoothingKernel extends SmoothingKernel {

	private static final long serialVersionUID = 3643920557118092883L;

	@Override
	public double getWeight(double distance) {
		if (distance <= 1)
			return 1d - distance;
		return 0;
	}

	@Override
	public String toString() {
		return "Triangular Smoothing Kernel";
	}

}