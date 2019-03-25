package com.example.fortnitestatsdisplayer.model

data class FortniteResponse(
        // val accountId: String,
        //val epicUserHandle: String,
        val lifeTimeStats: List<LifeTimeStat>,
        // val platformId: Int,
        //val platformName: String,
        // val platformNameLong: String,
        val recentMatches: List<RecentMatches>,
        val stats: Stats

) {
//    fun getSummary(): String = with(stats.curr_p9) {
//        """
//        KD: ${kd.displayValue}
//        Kills: ${kills.displayValue}
//        Kills per game: ${kpg.displayValue}
//        Matches: ${matches.displayValue}
//        Wins: ${top1.displayValue}
//        WinRatio: ${winRatio.displayValue}
//    """.trimIndent()
//    }
//
//    fun summarizeLifeTimeStats(): String = lifeTimeStats.map {
//        "Some stat: ${it.key}"
//
//    }.toString()
}

data class Stats(
        val curr_p10: CurrP10,
//    val curr_p2: CurrP2,
  val curr_p9: CurrP9
//    val p10: P10,
//    val p2: P2,
//    val p9: P9
)


data class CurrP10(
        val kd: Kd,
        val kills: Kills,
        val kpg: Kpg,
        val matches: Matches,
        //val score: Score,
        //  val scorePerMatch: ScorePerMatch,
        val top1: Top1,
//    val top10: Top10,
//    val top12: Top12,
//    val top25: Top25,
//    val top3: Top3,
//    val top5: Top5,
//    val top6: Top6,
        //  val trnRating: TrnRating,
        val winRatio: WinRatio
)

data class Top6(
        val category: String,
        val displayValue: String,
        val `field`: String,
        val label: String,
        val rank: Int,
        val value: String,
        val valueInt: Int
)

data class Top10(
        val category: String,
        val displayValue: String,
        val `field`: String,
        val label: String,
        val rank: Int,
        val value: String,
        val valueInt: Int
)

data class Top5(
        val category: String,
        val displayValue: String,
        val `field`: String,
        val label: String,
        val percentile: Double,
        val rank: Int,
        val value: String,
        val valueInt: Int
)

data class Top25(
        val category: String,
        val displayValue: String,
        val `field`: String,
        val label: String,
        val rank: Int,
        val value: String,
        val valueInt: Int
)

data class Top1(
        //val category: String,
        val displayValue: String
        /*   val `field`: String,
           val label: String,
           val percentile: Double,
           val rank: Int,
           val value: String,
           val valueInt: Int*/
)

data class Kills(
        // val category: String,
        val displayValue: String
        /*   val `field`: String,
           val label: String,
           val percentile: Double,
           val rank: Int,
           val value: String,
           val valueInt: Int*/
)

data class Score(
        val category: String,
        val displayValue: String,
        val `field`: String,
        val label: String,
        val percentile: Double,
        val rank: Int,
        val value: String,
        val valueInt: Int
)

data class TrnRating(
        val category: String,
        val displayValue: String,
        val `field`: String,
        val label: String,
        val percentile: Double,
        val rank: Int,
        val value: String,
        val valueInt: Int
)

data class Top12(
        val category: String,
        val displayValue: String,
        val `field`: String,
        val label: String,
        val percentile: Double,
        val rank: Int,
        val value: String,
        val valueInt: Int
)

data class ScorePerMatch(
        val category: String,
        val displayValue: String,
        val `field`: String,
        val label: String,
        val percentile: Double,
        val rank: Int,
        val value: String,
        val valueDec: Double
)

data class Kpg(
        //  val category: String,
        val displayValue: String
        /* val `field`: String,
         val label: String,
         val percentile: Double,
         val rank: Int,
         val value: String,
         val valueDec: Double*/
)

data class Top3(
        val category: String,
        val displayValue: String,
        val `field`: String,
        val label: String,
        val rank: Int,
        val value: String,
        val valueInt: Int
)

data class Matches(
        //val category: String,
        val displayValue: String
        /* val `field`: String,
         val label: String,
         val percentile: Double,
         val rank: Int,
         val value: String,
         val valueInt: Int*/
)

data class WinRatio(
        //val category: String,
        val displayValue: String
        /* val `field`: String,
         val label: String,
         val percentile: Double,
         val rank: Int,
         val value: String,
         val valueDec: Double*/
)

data class Kd(
        // val category: String,
        val displayValue: String
        //  val `field`: String,
        //val label: String,
        //  val percentile: Double,
        //  val rank: Int
        // val value: String,
        //val valueDec: Double
)

data class P10(
        val kd: Kd,
        val kills: Kills,
        val kpg: Kpg,
        val matches: Matches,
        val score: Score,
        val scorePerMatch: ScorePerMatch,
        val top1: Top1,
        val top10: Top10X,
        val top12: Top12X,
        val top25: Top25X,
        val top3: Top3X,
        val top5: Top5X,
        val top6: Top6X,
        val trnRating: TrnRating,
        val winRatio: WinRatio
)

data class CurrP2(
        val kd: Kd,
        val kills: Kills,
        val kpg: Kpg,
        val matches: Matches,
        val score: Score,
        val scorePerMatch: ScorePerMatch,
        val top1: Top1,
        val top10: Top10X,
        val top12: Top12X,
        val top25: Top25X,
        val top3: Top3X,
        val top5: Top5X,
        val top6: Top6X,
        val trnRating: TrnRating,
        val winRatio: WinRatio
)

data class Top10X(
        val category: String,
        val displayValue: String,
        val `field`: String,
        val label: String,
        val percentile: Double,
        val rank: Int,
        val value: String,
        val valueInt: Int
)

data class Top5X(
        val category: String,
        val displayValue: String,
        val `field`: String,
        val label: String,
        val rank: Int,
        val value: String,
        val valueInt: Int
)

data class Top25X(
        val category: String,
        val displayValue: String,
        val `field`: String,
        val label: String,
        val percentile: Double,
        val rank: Int,
        val value: String,
        val valueInt: Int
)

data class Top12X(
        val category: String,
        val displayValue: String,
        val `field`: String,
        val label: String,
        val rank: Int,
        val value: String,
        val valueInt: Int
)

data class P9(
        val kd: Kd,
        val kills: Kills,
        val kpg: Kpg,
        val matches: Matches,
        val score: Score,
        val scorePerMatch: ScorePerMatch,
        val top1: Top1,
        val top10: Top10,
        val top12: Top12,
        val top25: Top25,
        val top3: Top3X,
        val top5: Top5,
        val top6: Top6X,
        val trnRating: TrnRating,
        val winRatio: WinRatio
)

data class Top6X(
        val category: String,
        val displayValue: String,
        val `field`: String,
        val label: String,
        val percentile: Double,
        val rank: Int,
        val value: String,
        val valueInt: Int
)

data class Top3X(
        val category: String,
        val displayValue: String,
        val `field`: String,
        val label: String,
        val percentile: Double,
        val rank: Int,
        val value: String,
        val valueInt: Int
)

data class P2(
        val kd: Kd,
        val kills: Kills,
        val kpg: Kpg,
        val matches: Matches,
        val score: Score,
        val scorePerMatch: ScorePerMatch,
        val top1: Top1,
        val top10: Top10,
        val top12: Top12,
        val top25: Top25,
        val top3: Top3,
        val top5: Top5,
        val top6: Top6,
        val trnRating: TrnRating,
        val winRatio: WinRatio
)

data class CurrP9(
        val kd: Kd,
        val kills: Kills,
        val kpg: Kpg,
        val matches: Matches,
        val score: Score,
        val scorePerMatch: ScorePerMatch,
        val top1: Top1,
        val top10: Top10,
        val top12: Top12,
        val top25: Top25,
        val top3: Top3,
        val top5: Top5,
        val top6: Top6,
        val trnRating: TrnRating,
        val winRatio: WinRatio
)

data class RecentMatches(
//        val accountId: String,
//        val dateCollected: String,
//        val id: Int,
        val kills: Int,
        val matches: Int,
       // val minutesPlayed: Int,
//        val platform: Int,
//        val playlist: String,
//        val score: Int,
        val top1: Int,
//        val top10: Int,
//        val top12: Int,
//        val top25: Int,
        val top3: Int,
        val top5: Int,
        val top6: Int
//        val trnRating: Double,
//        val trnRatingChange: Double
)


data class LifeTimeStat(
        val key: String,
        val value: String

)