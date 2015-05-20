# Synopsis

Test project example for leJOS (Java for LEGO Mindstorms).

Using leJOS EV3 0.9.0-beta.

# How to run
## Build 
You need to:

* Install gradle and have it in your path
* Set the environment variable EV3_HOME to the directory where you extracted the leJOS distribution

Afterwards, you need to run:

```./gradlew clean build```

By executing this command you build and test your leJOS Application. If everything runs successfully then you find the application JAR in the subfolder "build/libs".
You can deploy this JAR on the robot.


## Deploy 
You can deploy your application on a Lego Mindstorm EV3 robot running leJOS by executing the following command:

```./gradlew deployev3```

If your robot is not connected via USB, but via WiFi then you must update the gradle.properties file to point to the correct IP and use the correct username/password.

# License
Copyright 2015 David Aguiar

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.