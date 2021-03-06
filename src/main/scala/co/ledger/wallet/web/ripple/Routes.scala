package co.ledger.wallet.web.ripple

import biz.enef.angulate.ext.{Route, RouteProvider}

/**
  *
  * Routes
  * ledger-wallet-ripple-chrome
  *
  * Created by Pierre Pollastri on 03/05/2016.
  *
  * The MIT License (MIT)
  *
  * Copyright (c) 2016 Ledger
  *
  * Permission is hereby granted, free of charge, to any person obtaining a copy
  * of this software and associated documentation files (the "Software"), to deal
  * in the Software without restriction, including without limitation the rights
  * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
  * copies of the Software, and to permit persons to whom the Software is
  * furnished to do so, subject to the following conditions:
  *
  * The above copyright notice and this permission notice shall be included in all
  * copies or substantial portions of the Software.
  *
  * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
  * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
  * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
  * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
  * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
  * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
  * SOFTWARE.
  *
  */
object Routes {

  def declare($routeProvider: RouteProvider) = {
    $routeProvider
      .when("/onboarding/launch/:discover/:animated?", Route(templateUrl = "/templates/onboarding/launch.html"))
      .when("/onboarding/linux/:animated?", Route(templateUrl = "/templates/onboarding/linux.html"))
      .when("/onboarding/opening/", Route(templateUrl =
        "/templates/onboarding/opening.html"))
      .when("/onboarding/split-disclaimer/:balance", Route(templateUrl = "/templates/onboarding/split-disclaimer.html"))
      .when("/onboarding/update", Route(templateUrl = "/templates/onboarding/update.html"))
      .when("/onboarding/download/:tag", Route(templateUrl = "/templates/onboarding/download.html"))
      .when("/account/:id", Route(templateUrl = "/templates/wallet/account.html"))
      .when("/send", Route(templateUrl = "/templates/wallet/send/index.html"))
      .when("/send/:amount/to/:recipient/from/:account_id/with/:fee/tag/:tag?", Route(templateUrl = "/templates/wallet/send/perform.html"))
      .when("/receive", Route(templateUrl = "/templates/wallet/receive.html"))
      .when("/help", Route(templateUrl = "/templates/wallet/help.html"))
      .otherwise(Route(redirectTo = "/onboarding/launch/0"))
  }
}
