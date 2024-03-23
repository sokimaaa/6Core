#!/bin/bash

echo "======= Started verify step ======="
cd "3-platform/"
step_exit_code=0

for dir in */; do
  echo "Verifying the $dir"
  cd $dir
  mvn spotless:check
  step_exit_code=$(($? | step_exit_code))
  cd ..
  done

cd ..
echo "The step exit code is equal: $step_exit_code"
echo "======= Verify step is finished ======="
exit $step_exit_code