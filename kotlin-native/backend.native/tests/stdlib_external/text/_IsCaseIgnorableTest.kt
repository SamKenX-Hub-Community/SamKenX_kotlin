/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package test.text

//
// NOTE: THIS FILE IS AUTO-GENERATED by the GenerateUnicodeData.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

import kotlin.test.*

@SharedImmutable
private val caseIgnorableRanges = arrayOf<IntRange>(
    0x0027..0x0027,
    0x002e..0x002e,
    0x003a..0x003a,
    0x005e..0x005e,
    0x0060..0x0060,
    0x00a8..0x00a8,
    0x00ad..0x00ad,
    0x00af..0x00af,
    0x00b4..0x00b4,
    0x00b7..0x00b7,
    0x00b8..0x00b8,
    0x02b0..0x02c1,
    0x02c2..0x02c5,
    0x02c6..0x02d1,
    0x02d2..0x02df,
    0x02e0..0x02e4,
    0x02e5..0x02eb,
    0x02ec..0x02ec,
    0x02ed..0x02ed,
    0x02ee..0x02ee,
    0x02ef..0x02ff,
    0x0300..0x036f,
    0x0374..0x0374,
    0x0375..0x0375,
    0x037a..0x037a,
    0x0384..0x0385,
    0x0387..0x0387,
    0x0483..0x0487,
    0x0488..0x0489,
    0x0559..0x0559,
    0x055f..0x055f,
    0x0591..0x05bd,
    0x05bf..0x05bf,
    0x05c1..0x05c2,
    0x05c4..0x05c5,
    0x05c7..0x05c7,
    0x05f4..0x05f4,
    0x0600..0x0605,
    0x0610..0x061a,
    0x061c..0x061c,
    0x0640..0x0640,
    0x064b..0x065f,
    0x0670..0x0670,
    0x06d6..0x06dc,
    0x06dd..0x06dd,
    0x06df..0x06e4,
    0x06e5..0x06e6,
    0x06e7..0x06e8,
    0x06ea..0x06ed,
    0x070f..0x070f,
    0x0711..0x0711,
    0x0730..0x074a,
    0x07a6..0x07b0,
    0x07eb..0x07f3,
    0x07f4..0x07f5,
    0x07fa..0x07fa,
    0x07fd..0x07fd,
    0x0816..0x0819,
    0x081a..0x081a,
    0x081b..0x0823,
    0x0824..0x0824,
    0x0825..0x0827,
    0x0828..0x0828,
    0x0829..0x082d,
    0x0859..0x085b,
    0x08d3..0x08e1,
    0x08e2..0x08e2,
    0x08e3..0x0902,
    0x093a..0x093a,
    0x093c..0x093c,
    0x0941..0x0948,
    0x094d..0x094d,
    0x0951..0x0957,
    0x0962..0x0963,
    0x0971..0x0971,
    0x0981..0x0981,
    0x09bc..0x09bc,
    0x09c1..0x09c4,
    0x09cd..0x09cd,
    0x09e2..0x09e3,
    0x09fe..0x09fe,
    0x0a01..0x0a02,
    0x0a3c..0x0a3c,
    0x0a41..0x0a42,
    0x0a47..0x0a48,
    0x0a4b..0x0a4d,
    0x0a51..0x0a51,
    0x0a70..0x0a71,
    0x0a75..0x0a75,
    0x0a81..0x0a82,
    0x0abc..0x0abc,
    0x0ac1..0x0ac5,
    0x0ac7..0x0ac8,
    0x0acd..0x0acd,
    0x0ae2..0x0ae3,
    0x0afa..0x0aff,
    0x0b01..0x0b01,
    0x0b3c..0x0b3c,
    0x0b3f..0x0b3f,
    0x0b41..0x0b44,
    0x0b4d..0x0b4d,
    0x0b55..0x0b56,
    0x0b62..0x0b63,
    0x0b82..0x0b82,
    0x0bc0..0x0bc0,
    0x0bcd..0x0bcd,
    0x0c00..0x0c00,
    0x0c04..0x0c04,
    0x0c3e..0x0c40,
    0x0c46..0x0c48,
    0x0c4a..0x0c4d,
    0x0c55..0x0c56,
    0x0c62..0x0c63,
    0x0c81..0x0c81,
    0x0cbc..0x0cbc,
    0x0cbf..0x0cbf,
    0x0cc6..0x0cc6,
    0x0ccc..0x0ccd,
    0x0ce2..0x0ce3,
    0x0d00..0x0d01,
    0x0d3b..0x0d3c,
    0x0d41..0x0d44,
    0x0d4d..0x0d4d,
    0x0d62..0x0d63,
    0x0d81..0x0d81,
    0x0dca..0x0dca,
    0x0dd2..0x0dd4,
    0x0dd6..0x0dd6,
    0x0e31..0x0e31,
    0x0e34..0x0e3a,
    0x0e46..0x0e46,
    0x0e47..0x0e4e,
    0x0eb1..0x0eb1,
    0x0eb4..0x0ebc,
    0x0ec6..0x0ec6,
    0x0ec8..0x0ecd,
    0x0f18..0x0f19,
    0x0f35..0x0f35,
    0x0f37..0x0f37,
    0x0f39..0x0f39,
    0x0f71..0x0f7e,
    0x0f80..0x0f84,
    0x0f86..0x0f87,
    0x0f8d..0x0f97,
    0x0f99..0x0fbc,
    0x0fc6..0x0fc6,
    0x102d..0x1030,
    0x1032..0x1037,
    0x1039..0x103a,
    0x103d..0x103e,
    0x1058..0x1059,
    0x105e..0x1060,
    0x1071..0x1074,
    0x1082..0x1082,
    0x1085..0x1086,
    0x108d..0x108d,
    0x109d..0x109d,
    0x10fc..0x10fc,
    0x135d..0x135f,
    0x1712..0x1714,
    0x1732..0x1734,
    0x1752..0x1753,
    0x1772..0x1773,
    0x17b4..0x17b5,
    0x17b7..0x17bd,
    0x17c6..0x17c6,
    0x17c9..0x17d3,
    0x17d7..0x17d7,
    0x17dd..0x17dd,
    0x180b..0x180d,
    0x180e..0x180e,
    0x1843..0x1843,
    0x1885..0x1886,
    0x18a9..0x18a9,
    0x1920..0x1922,
    0x1927..0x1928,
    0x1932..0x1932,
    0x1939..0x193b,
    0x1a17..0x1a18,
    0x1a1b..0x1a1b,
    0x1a56..0x1a56,
    0x1a58..0x1a5e,
    0x1a60..0x1a60,
    0x1a62..0x1a62,
    0x1a65..0x1a6c,
    0x1a73..0x1a7c,
    0x1a7f..0x1a7f,
    0x1aa7..0x1aa7,
    0x1ab0..0x1abd,
    0x1abe..0x1abe,
    0x1abf..0x1ac0,
    0x1b00..0x1b03,
    0x1b34..0x1b34,
    0x1b36..0x1b3a,
    0x1b3c..0x1b3c,
    0x1b42..0x1b42,
    0x1b6b..0x1b73,
    0x1b80..0x1b81,
    0x1ba2..0x1ba5,
    0x1ba8..0x1ba9,
    0x1bab..0x1bad,
    0x1be6..0x1be6,
    0x1be8..0x1be9,
    0x1bed..0x1bed,
    0x1bef..0x1bf1,
    0x1c2c..0x1c33,
    0x1c36..0x1c37,
    0x1c78..0x1c7d,
    0x1cd0..0x1cd2,
    0x1cd4..0x1ce0,
    0x1ce2..0x1ce8,
    0x1ced..0x1ced,
    0x1cf4..0x1cf4,
    0x1cf8..0x1cf9,
    0x1d2c..0x1d6a,
    0x1d78..0x1d78,
    0x1d9b..0x1dbf,
    0x1dc0..0x1df9,
    0x1dfb..0x1dff,
    0x1fbd..0x1fbd,
    0x1fbf..0x1fc1,
    0x1fcd..0x1fcf,
    0x1fdd..0x1fdf,
    0x1fed..0x1fef,
    0x1ffd..0x1ffe,
    0x200b..0x200f,
    0x2018..0x2018,
    0x2019..0x2019,
    0x2024..0x2024,
    0x2027..0x2027,
    0x202a..0x202e,
    0x2060..0x2064,
    0x2066..0x206f,
    0x2071..0x2071,
    0x207f..0x207f,
    0x2090..0x209c,
    0x20d0..0x20dc,
    0x20dd..0x20e0,
    0x20e1..0x20e1,
    0x20e2..0x20e4,
    0x20e5..0x20f0,
    0x2c7c..0x2c7d,
    0x2cef..0x2cf1,
    0x2d6f..0x2d6f,
    0x2d7f..0x2d7f,
    0x2de0..0x2dff,
    0x2e2f..0x2e2f,
    0x3005..0x3005,
    0x302a..0x302d,
    0x3031..0x3035,
    0x303b..0x303b,
    0x3099..0x309a,
    0x309b..0x309c,
    0x309d..0x309e,
    0x30fc..0x30fe,
    0xa015..0xa015,
    0xa4f8..0xa4fd,
    0xa60c..0xa60c,
    0xa66f..0xa66f,
    0xa670..0xa672,
    0xa674..0xa67d,
    0xa67f..0xa67f,
    0xa69c..0xa69d,
    0xa69e..0xa69f,
    0xa6f0..0xa6f1,
    0xa700..0xa716,
    0xa717..0xa71f,
    0xa720..0xa721,
    0xa770..0xa770,
    0xa788..0xa788,
    0xa789..0xa78a,
    0xa7f8..0xa7f9,
    0xa802..0xa802,
    0xa806..0xa806,
    0xa80b..0xa80b,
    0xa825..0xa826,
    0xa82c..0xa82c,
    0xa8c4..0xa8c5,
    0xa8e0..0xa8f1,
    0xa8ff..0xa8ff,
    0xa926..0xa92d,
    0xa947..0xa951,
    0xa980..0xa982,
    0xa9b3..0xa9b3,
    0xa9b6..0xa9b9,
    0xa9bc..0xa9bd,
    0xa9cf..0xa9cf,
    0xa9e5..0xa9e5,
    0xa9e6..0xa9e6,
    0xaa29..0xaa2e,
    0xaa31..0xaa32,
    0xaa35..0xaa36,
    0xaa43..0xaa43,
    0xaa4c..0xaa4c,
    0xaa70..0xaa70,
    0xaa7c..0xaa7c,
    0xaab0..0xaab0,
    0xaab2..0xaab4,
    0xaab7..0xaab8,
    0xaabe..0xaabf,
    0xaac1..0xaac1,
    0xaadd..0xaadd,
    0xaaec..0xaaed,
    0xaaf3..0xaaf4,
    0xaaf6..0xaaf6,
    0xab5b..0xab5b,
    0xab5c..0xab5f,
    0xab69..0xab69,
    0xab6a..0xab6b,
    0xabe5..0xabe5,
    0xabe8..0xabe8,
    0xabed..0xabed,
    0xfb1e..0xfb1e,
    0xfbb2..0xfbc1,
    0xfe00..0xfe0f,
    0xfe13..0xfe13,
    0xfe20..0xfe2f,
    0xfe52..0xfe52,
    0xfe55..0xfe55,
    0xfeff..0xfeff,
    0xff07..0xff07,
    0xff0e..0xff0e,
    0xff1a..0xff1a,
    0xff3e..0xff3e,
    0xff40..0xff40,
    0xff70..0xff70,
    0xff9e..0xff9f,
    0xffe3..0xffe3,
    0xfff9..0xfffb,
    0x101fd..0x101fd,
    0x102e0..0x102e0,
    0x10376..0x1037a,
    0x10a01..0x10a03,
    0x10a05..0x10a06,
    0x10a0c..0x10a0f,
    0x10a38..0x10a3a,
    0x10a3f..0x10a3f,
    0x10ae5..0x10ae6,
    0x10d24..0x10d27,
    0x10eab..0x10eac,
    0x10f46..0x10f50,
    0x11001..0x11001,
    0x11038..0x11046,
    0x1107f..0x11081,
    0x110b3..0x110b6,
    0x110b9..0x110ba,
    0x110bd..0x110bd,
    0x110cd..0x110cd,
    0x11100..0x11102,
    0x11127..0x1112b,
    0x1112d..0x11134,
    0x11173..0x11173,
    0x11180..0x11181,
    0x111b6..0x111be,
    0x111c9..0x111cc,
    0x111cf..0x111cf,
    0x1122f..0x11231,
    0x11234..0x11234,
    0x11236..0x11237,
    0x1123e..0x1123e,
    0x112df..0x112df,
    0x112e3..0x112ea,
    0x11300..0x11301,
    0x1133b..0x1133c,
    0x11340..0x11340,
    0x11366..0x1136c,
    0x11370..0x11374,
    0x11438..0x1143f,
    0x11442..0x11444,
    0x11446..0x11446,
    0x1145e..0x1145e,
    0x114b3..0x114b8,
    0x114ba..0x114ba,
    0x114bf..0x114c0,
    0x114c2..0x114c3,
    0x115b2..0x115b5,
    0x115bc..0x115bd,
    0x115bf..0x115c0,
    0x115dc..0x115dd,
    0x11633..0x1163a,
    0x1163d..0x1163d,
    0x1163f..0x11640,
    0x116ab..0x116ab,
    0x116ad..0x116ad,
    0x116b0..0x116b5,
    0x116b7..0x116b7,
    0x1171d..0x1171f,
    0x11722..0x11725,
    0x11727..0x1172b,
    0x1182f..0x11837,
    0x11839..0x1183a,
    0x1193b..0x1193c,
    0x1193e..0x1193e,
    0x11943..0x11943,
    0x119d4..0x119d7,
    0x119da..0x119db,
    0x119e0..0x119e0,
    0x11a01..0x11a0a,
    0x11a33..0x11a38,
    0x11a3b..0x11a3e,
    0x11a47..0x11a47,
    0x11a51..0x11a56,
    0x11a59..0x11a5b,
    0x11a8a..0x11a96,
    0x11a98..0x11a99,
    0x11c30..0x11c36,
    0x11c38..0x11c3d,
    0x11c3f..0x11c3f,
    0x11c92..0x11ca7,
    0x11caa..0x11cb0,
    0x11cb2..0x11cb3,
    0x11cb5..0x11cb6,
    0x11d31..0x11d36,
    0x11d3a..0x11d3a,
    0x11d3c..0x11d3d,
    0x11d3f..0x11d45,
    0x11d47..0x11d47,
    0x11d90..0x11d91,
    0x11d95..0x11d95,
    0x11d97..0x11d97,
    0x11ef3..0x11ef4,
    0x13430..0x13438,
    0x16af0..0x16af4,
    0x16b30..0x16b36,
    0x16b40..0x16b43,
    0x16f4f..0x16f4f,
    0x16f8f..0x16f92,
    0x16f93..0x16f9f,
    0x16fe0..0x16fe1,
    0x16fe3..0x16fe3,
    0x16fe4..0x16fe4,
    0x1bc9d..0x1bc9e,
    0x1bca0..0x1bca3,
    0x1d167..0x1d169,
    0x1d173..0x1d17a,
    0x1d17b..0x1d182,
    0x1d185..0x1d18b,
    0x1d1aa..0x1d1ad,
    0x1d242..0x1d244,
    0x1da00..0x1da36,
    0x1da3b..0x1da6c,
    0x1da75..0x1da75,
    0x1da84..0x1da84,
    0x1da9b..0x1da9f,
    0x1daa1..0x1daaf,
    0x1e000..0x1e006,
    0x1e008..0x1e018,
    0x1e01b..0x1e021,
    0x1e023..0x1e024,
    0x1e026..0x1e02a,
    0x1e130..0x1e136,
    0x1e137..0x1e13d,
    0x1e2ec..0x1e2ef,
    0x1e8d0..0x1e8d6,
    0x1e944..0x1e94a,
    0x1e94b..0x1e94b,
    0x1f3fb..0x1f3ff,
    0xe0001..0xe0001,
    0xe0020..0xe007f,
    0xe0100..0xe01ef,
)

class IsCaseIgnorableTest {
    @Test
    fun isCaseIgnorable() {
        var lastChecked = -1
        for (range in caseIgnorableRanges) {
            for (codePoint in lastChecked + 1 until range.first) {
                assertFalse(codePoint.isCaseIgnorable())
            }
            for (codePoint in range.first..range.last) {
                assertTrue(codePoint.isCaseIgnorable())
            }
            lastChecked = range.last
        }
        for (codePoint in lastChecked + 1..0x10FFFF) {
            assertFalse(codePoint.isCaseIgnorable())
        }
    }
}
