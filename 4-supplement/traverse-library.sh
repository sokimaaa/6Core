#!/bin/bash

echo "======= Started library traversing ======="
cd "2-library/"
step_exit_code=0

directories=$(find . -mindepth 1 -maxdepth 1 -type d)

for dir in $directories; do
  echo "Building the $dir"

  if [ -e "$dir/pom.xml" ]; then
    echo "Building the library..."
    cd "$dir" && mvn -B clean install && cd ..
    step_exit_code=$(($? | step_exit_code))
  else
    echo "Building of current library is skipped due missing pom.xml."
  fi

  done

cd ..
echo "The step exit code is equal: $step_exit_code"
echo "======= Library building is finished ======="
exit $step_exit_code