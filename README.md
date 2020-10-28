**CPEN 221 / Fall 2020 / Exercise 9**

Minimize Pairs
====

Given a `String` that contains only `0`s, `1`s and `?`s, you can change each `?` into a `0` or `1`. You want to change the `?`s such that you minimize the number of consecutive pairs.

You should implement the method `getMinimumPairs` in the class `ZeroOneStrings` that returns the minimum number of pairs that can exist in the given string.

## Examples

1. `ZeroOneStrings.getMinimumStrings("0100")` should return `1` because there are no `?`s to replace and the string contains one pair.
2. `ZeroOneStrings.getMinimumStrings("??")` should return `0` because one can change `??` into either `01` or `10` with no pairs. This example also illustrates the fact that different occurrences of `?`s can be replaced by different symbols.