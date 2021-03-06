/*
 * Copyright (c) 2019-present, Facebook, Inc.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */
public class Client {

  Account account;

  void getPaid(int amount) {
    account.deposit(amount);
  }

  int buyCoffee() {
    return account.withdraw(5);
  }
}
