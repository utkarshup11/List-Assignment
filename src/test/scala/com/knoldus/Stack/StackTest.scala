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
package com.knoldus.Stack

import org.scalatest.flatspec.AnyFlatSpec

class StackTest extends AnyFlatSpec {

  val stackImpl = new StackImpl

  //scalastyle:off magic.number

  "push operation " should "add element to stack " in {
    val listTest = List(1, 2, 3)
    assert(stackImpl.push(listTest, 10) == List(10, 1, 2, 3))

  }

  //negative test case
  "push operation " should "correctly add element to stack " in {
    val listTest = List(1, 2, 3)
    assert(stackImpl.push(listTest, 10) != List(1, 2, 3, 10))

  }

  it should "throw NoSuchElementException when trying to delete element from an empty stack" in {
    assertThrows[NoSuchElementException] {
      stackImpl.pop(List())
    }
  }

  "pop operation" should " delete last inserted element from stack" in {
    assert(stackImpl.pop(List(1, 2, 3, 4)) == List(2, 3, 4))
  }

  //negative test case for pop operation
  "pop operation" should " delete last inserted element correctly from stack" in {
    assert(stackImpl.pop(List(1, 2, 3, 4)) != List(1, 2, 3))
  }

  //test case for peek method
  "peep operation " should " return first element from the stack " in {
    assert(stackImpl.peek(List(10, 20, 30, 40)) == 10)
  }


  //negative test cases for peek operation
  "peep operation " should " return first element correctly from the stack " in {
    assert(stackImpl.peek(List(10, 20, 30, 40)) != 20)
  }


  it should "throw NoSuchElementException when trying to get first element from an empty stack" in {
    assertThrows[NoSuchElementException] {
      stackImpl.peek(List())
    }
  }

}
