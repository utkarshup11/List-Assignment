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
package com.knoldus.Queue

import org.scalatest.flatspec.AnyFlatSpec

class QueueTest extends AnyFlatSpec {
  val queueImpl = new QueueImpl

  //scalastyle:off magic.number


  it should "throw NoSuchElementException when delete element from a empty queue " in {
    assertThrows[NoSuchElementException] {
      queueImpl.pop(List())
    }
  }

  "pop operation " should "delete first in element from queue " in {
    assert(queueImpl.pop(List(1, 2, 3, 4)) == List(1, 2, 3))
  }

  //negative test case
  "pop operation " should "not delete first last inserted from queue " in {
    assert(queueImpl.pop(List(1, 2, 3, 4)) != List(2, 3, 4))
  }

  "push operation " should "add element to queue " in {
    val listTest = List(1, 2, 3)
    assert(queueImpl.push(listTest, 10) == List(10, 1, 2, 3))

  }

  //negative test case
  "push operation " should "add element to queue in first position " in {
    val listTest = List(1, 2, 3)
    assert(queueImpl.push(listTest, 10) != List(1, 2, 3, 10))

  }

}
