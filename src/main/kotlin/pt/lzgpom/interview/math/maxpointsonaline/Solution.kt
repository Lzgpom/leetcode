package pt.lzgpom.interview.math.maxpointsonaline

import kotlin.math.max

class Solution {
    fun maxPoints(points: Array<IntArray>): Int {
        if (points.size == 1)  return 1

        var max = 2

        for (i in points.indices) {
            for (j in i + 1..points.lastIndex) {
                val equation = getEquationForPoints(points[i], points[j])
                var count = 0

                for (point in points) {
                    if (point in equation) {
                        count++
                    }
                }

                max = max(max, count)
            }
        }

        return max
    }

    private fun getEquationForPoints(point1: IntArray, point2: IntArray): Equation {
        val (x1, y1) = point1.map { it.toDouble() }
        val (x2, y2) = point2.map { it.toDouble() }

        if (x1 == x2) return XEquation(x1)
        if (y1 == y2) return YEquation(y1)

        val m = (y2 - y1) / (x2 - x1)
        val b = y1 - (m * x1)

        return SlopedEquation(m, b)
    }

    interface Equation {
        operator fun contains(point: IntArray): Boolean
    }

    data class XEquation(val x: Double) : Equation {
        override fun contains(point: IntArray): Boolean {
            val (pointX, _) = point
            return x.toInt() == pointX
        }
    }

    data class YEquation(val y: Double) : Equation {
        override fun contains(point: IntArray): Boolean {
            val (_, pointY) = point
            return y.toInt() == pointY
        }
    }

    data class SlopedEquation(val m: Double, val b: Double) : Equation {
        override operator fun contains(point: IntArray): Boolean {
            val (x, y) = point.map { it.toDouble() }
            var yPotential: Double = m * x + b
            yPotential = Math.round(yPotential * 10000.0) / 10000.0

            return y == yPotential
        }
    }
}