// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.knoldus.List

import org.scalatest.flatspec.AnyFlatSpec

class TableTest extends AnyFlatSpec {

  val tableImpl = new TableImpl

  //scalastyle:off magic.number

  it should "return table of each element from list" in {
    val expected = List(
      List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),
      List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20),
      List(3, 6, 9, 12, 15, 18, 21, 24, 27, 30)
    )
    assert(tableImpl.getListOfTables(List(1, 2, 3)) == expected)

  }


  it should "return table of  each element correctly from list" in {
    val expected = List(
      List(0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
      List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20),
      List(3, 6, 9, 12, 15, 18, 21, 24, 27, 30)
    )
    assert(tableImpl.getListOfTables(List(1, 2, 3)) != expected)

  }


  "getListOFTables " should "return empty list when input list is empty " in {
    val expected = List()
    assert(tableImpl.getListOfTables(List()) == expected)

  }


}
