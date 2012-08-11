/*
 * This file is part of Rootbeer.
 * 
 * Rootbeer is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Rootbeer is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Rootbeer.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */

package edu.syr.pcpratts.rootbeer.testcases.rootbeertest.serialization;

import edu.syr.pcpratts.rootbeer.runtime.Kernel;
import edu.syr.pcpratts.rootbeer.test.TestSerialization;
import java.util.ArrayList;
import java.util.List;

public class RefTypeArrays implements TestSerialization{

  public List<Kernel> create() {
    List<Kernel> jobs = new ArrayList<Kernel>();
    for(int i = 0; i < 50; ++i){
      RefTypeArraysRunOnGpu curr = new RefTypeArraysRunOnGpu();
      jobs.add(curr);
    }
    return jobs;
  }

  public boolean compare(Kernel lhs, Kernel rhs) {
    RefTypeArraysRunOnGpu blhs = (RefTypeArraysRunOnGpu) lhs;
    RefTypeArraysRunOnGpu brhs = (RefTypeArraysRunOnGpu) rhs;
    return blhs.compare(brhs);
  }
}
