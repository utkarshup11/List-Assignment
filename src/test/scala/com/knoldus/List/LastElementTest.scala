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

class LastElementTest extends AnyFlatSpec {

  val lastElement = new LastElement

  //scalastyle:off magic.number

  //when list is empty
  it should "produce NoSuchElementException when List is empty" in {
    assertThrows[NoSuchElementException] {
      lastElement.getLastElement(List())
    }
  }

  "last element when list has only one element " should " be the number itself " in {
    assert(lastElement.getLastElement(List(1)) == 1)

  }

  "last element " should "be 10 in List(1 ,2,4,5,6,10 ) " in {
    assert(lastElement.getLastElement(List(1, 2, 4, 5, 6, 10)) == 10)

  }


  //negative test case
  "last element " should "be return correctly in List(300,2,4,544,6,1450 ) " in {
    assert(lastElement.getLastElement(List(300, 2, 4, 544, 6, 1450)) != 300)
  }


}
