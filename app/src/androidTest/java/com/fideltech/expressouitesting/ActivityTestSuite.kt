package com.fideltech.expressouitesting

import org.junit.runner.RunWith
import org.junit.runners.Suite


//run multiple test file at onece
//add classes in below
@RunWith(Suite::class)
@Suite.SuiteClasses(
    SecondaryActivityTest::class,
    MainActivityTest::class
)
class ActivityTestSuite {
}