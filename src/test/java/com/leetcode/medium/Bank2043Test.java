package com.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Bank2043Test {
    private Bank2043 bank;

    private void call(String[] methods, Object[][] params, Object[] expected) {
        Object[] results = new Object[methods.length];
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].equals("Bank")) {
                bank = new Bank2043((long[]) params[i][0]);
                results[i] = null;
            } else {
                switch (methods[i]) {
                    case "withdraw":
                        int account1 = ((Number) params[i][0]).intValue();
                        long money1 = ((Number) params[i][1]).longValue();
                        results[i] = bank.withdraw(account1, money1);
                        break;
                    case "transfer":
                        int from = ((Number) params[i][0]).intValue();
                        int to = ((Number) params[i][1]).intValue();
                        long money2 = ((Number) params[i][2]).longValue();
                        results[i] = bank.transfer(from, to, money2);
                        break;
                    case "deposit":
                        int account2 = ((Number) params[i][0]).intValue();
                        long money3 = ((Number) params[i][1]).longValue();
                        results[i] = bank.deposit(account2, money3);
                        break;
                }
            }
        }
        assertArrayEquals(expected, results);
    }


    @Test
    void testExample1() {
        call(
                new String[]{"Bank", "withdraw", "transfer", "deposit", "transfer", "withdraw"},
                new Object[][]{
                        new Object[]{new long[]{10, 100, 20, 50, 30}},
                        new Object[]{3, 10},
                        new Object[]{5, 1, 20},
                        new Object[]{5, 20},
                        new Object[]{3, 4, 15},
                        new Object[]{10, 50}
                },
                new Object[]{null, true, true, true, false, false}
        );
    }

    @Test
    void testExample2() {
        call(
                new String[]{"Bank", "deposit", "transfer", "transfer", "transfer", "deposit", "transfer", "withdraw", "withdraw",
                        "transfer", "transfer", "deposit", "withdraw", "deposit", "withdraw", "transfer", "withdraw", "transfer",
                        "withdraw", "transfer", "deposit", "deposit", "transfer", "deposit", "withdraw", "deposit", "deposit",
                        "transfer", "withdraw", "deposit", "transfer", "withdraw", "deposit", "deposit", "transfer", "deposit",
                        "withdraw", "withdraw", "deposit", "withdraw", "deposit", "deposit", "deposit", "transfer", "withdraw",
                        "transfer", "withdraw", "transfer", "transfer", "deposit", "transfer", "transfer", "withdraw", "withdraw",
                        "transfer", "transfer", "deposit", "withdraw", "deposit", "transfer", "transfer", "withdraw", "deposit",
                        "deposit", "transfer", "withdraw", "withdraw", "withdraw", "withdraw", "withdraw", "transfer", "transfer",
                        "transfer", "transfer", "withdraw", "deposit", "withdraw", "deposit", "withdraw", "withdraw", "deposit",
                        "withdraw", "transfer", "withdraw", "withdraw", "withdraw", "deposit", "deposit", "transfer", "deposit",
                        "deposit", "transfer", "transfer", "transfer", "transfer", "deposit", "transfer", "deposit", "deposit",
                        "withdraw", "transfer", "deposit", "deposit", "deposit", "withdraw", "withdraw", "withdraw", "transfer",
                        "deposit", "transfer", "deposit", "withdraw", "withdraw", "transfer", "transfer", "transfer", "deposit",
                        "withdraw", "withdraw", "withdraw", "deposit", "withdraw", "transfer", "transfer", "withdraw", "transfer",
                        "withdraw", "transfer", "deposit", "transfer", "transfer", "withdraw", "deposit", "transfer", "withdraw",
                        "withdraw", "withdraw", "withdraw", "transfer", "deposit", "withdraw", "transfer", "deposit", "transfer",
                        "withdraw", "withdraw", "transfer", "deposit", "withdraw", "deposit", "withdraw", "transfer", "transfer",
                        "withdraw", "transfer", "transfer", "transfer", "transfer", "deposit", "deposit", "deposit", "transfer",
                        "transfer", "withdraw", "deposit", "deposit", "deposit", "deposit", "transfer", "transfer", "withdraw",
                        "transfer", "transfer", "transfer", "deposit", "transfer", "deposit", "withdraw", "deposit", "transfer",
                        "withdraw", "transfer", "withdraw", "withdraw", "withdraw", "deposit", "deposit", "transfer", "withdraw",
                        "deposit", "withdraw", "withdraw", "withdraw", "deposit", "withdraw", "deposit", "withdraw", "deposit",
                        "transfer", "transfer", "withdraw", "transfer", "withdraw", "transfer", "transfer", "withdraw", "deposit",
                        "transfer", "transfer", "transfer", "deposit", "transfer", "withdraw", "transfer", "deposit", "withdraw",
                        "transfer", "withdraw", "transfer", "transfer", "withdraw", "transfer", "deposit", "transfer", "deposit",
                        "withdraw", "transfer", "deposit", "deposit", "withdraw", "transfer", "deposit", "transfer", "transfer",
                        "deposit", "transfer", "withdraw", "deposit", "transfer", "withdraw", "deposit", "transfer", "transfer",
                        "deposit", "deposit", "withdraw", "withdraw", "transfer", "withdraw", "withdraw", "withdraw", "transfer",
                        "deposit", "transfer", "withdraw", "transfer", "transfer", "transfer", "withdraw", "transfer", "withdraw",
                        "transfer", "deposit", "transfer", "withdraw", "transfer", "withdraw", "deposit", "transfer", "transfer",
                        "withdraw", "transfer", "deposit", "deposit", "transfer", "withdraw", "transfer", "transfer", "deposit",
                        "withdraw", "withdraw", "transfer", "deposit", "deposit", "transfer", "withdraw"},
                new Object[][]{
                        new Object[]{new long[]{
                                7070, 4948, 770, 1881, 5988, 6120, 4221, 1430, 1809, 3438, 9381, 5440, 5847, 1145, 5751, 1431, 5036,
                                3461, 5095, 4098, 9157, 3252, 491, 9758, 9726, 1691, 2488, 4390, 2948, 9658, 6823, 9956, 8917, 877, 8233,
                                5084, 4772, 8928, 8359, 1196, 7864, 9764, 6035, 2528, 5792, 5247, 6134, 4763, 9544, 6948, 8429, 2183,
                                9358, 7959, 4631, 1487, 1936, 8825, 7822, 2167, 2087, 505, 5703, 6796, 850, 7041, 6712, 6548, 1379, 3357,
                                3833, 7026, 7354, 3397, 8665, 9995, 9532, 4483, 9994, 9954, 50, 2071, 4131, 7921, 2386, 5226, 2470, 7628,
                                6232, 4175, 1595, 7684, 5434, 2062, 6864, 4101, 6122, 7620, 7918, 6374, 4660, 1268, 4260, 2406, 1496,
                                8782, 2690, 7944, 8579, 1494, 5992, 5937, 7341, 8824, 3124, 663, 7036, 8447, 8749, 7618, 5926, 4504,
                                7069, 1484, 8133, 3965, 8894, 7487, 1786, 932, 4081, 6096, 51, 5822, 2529, 8903, 3052, 2924, 8605, 6922,
                                8684, 4565, 9170, 7514, 404, 510, 4328, 1322, 6424, 8457, 7456, 136, 4472, 868, 9562, 1527, 4561, 6750,
                                4247, 8948, 2183, 6956, 8742, 245, 3211, 1612, 793, 9706, 335, 2952, 3663, 347, 1084, 6718, 2500, 1173,
                                4484, 2908, 2114, 7774, 3777, 1908, 8392, 4356, 4934, 7958, 5475, 3855, 1266, 5037, 4447, 4692, 7497,
                                9881, 1263, 8126, 5411, 429, 7878, 8199, 6346, 781, 9130, 80, 5329, 8888, 6028, 4460, 5164, 8174, 2374,
                                3773, 584, 4170, 8063, 4447, 9168, 4967, 2323, 4414, 9896, 9778, 7131, 7791, 1851, 3483, 7543, 5412, 636,
                                9977, 9870, 585, 5990, 4534, 708, 42, 3624, 4733, 9023, 6220, 2270, 1874, 3001, 7135, 1088, 1678, 5679,
                                3768, 4340, 2972, 4888, 9809, 2790, 4427, 2064, 3552, 5825, 7431, 2312, 3925, 6487, 6036, 3936, 1196,
                                9597, 4765, 1248, 9126, 905, 8252, 8300, 9696, 6699, 6293, 6811, 9159, 7804, 7295, 2563, 3028, 3861,
                                4490, 6009, 6011, 7916, 9028, 9354, 3367, 6038, 8693, 7135, 6025, 7243, 9326, 6842, 701, 4520, 7018,
                                8162, 9699, 4016, 6568, 386, 494, 274, 2695, 5837, 1278, 227, 6679, 5519, 8855, 2771, 4380, 3369, 4025,
                                8199, 75, 2803, 8862, 75, 8627, 802, 194, 4303, 4192, 6952, 9012, 9321, 1834, 4823, 2085, 8093, 4029,
                                9464, 1669, 6564, 3998, 9838, 9617, 8929, 5848, 348, 6949, 5726, 4650, 9693, 1639, 8182, 9924, 9505,
                                8230, 7299, 4315, 7936, 8073, 2258, 2013, 7189, 5957, 5757, 2439, 4249, 8121, 6268, 3557, 6029, 4110,
                                5467, 9661, 2788, 9318, 2569, 651, 7504, 3382, 3312, 8642, 9736, 9235, 4095, 5151, 445, 468, 744, 25,
                                3182, 8242, 180, 1554, 5387, 4529, 2874, 9909, 1577, 929, 263, 7638, 9603, 5360, 4395, 6319, 9897, 5073,
                                1954, 426, 4667, 943, 3582, 3646, 2727, 6466, 8036, 5248, 6364, 6800, 1615, 6413, 1081, 3640, 1201, 4139,
                                9323, 8404, 1286, 2514, 1415, 2861, 8853, 8963, 8454, 6507, 4639, 3779, 2639, 2943, 8864, 8737, 491,
                                9473, 4165, 1927, 3257, 7435, 6843, 5507, 512, 9278, 7776, 1677, 1771, 6602, 6933, 6793, 2826, 6864,
                                8414, 736, 940, 925, 9004, 3154, 568, 4746, 218, 3138, 7136, 15, 1583, 9683, 8953, 9389, 5504, 9032,
                                6713, 8125, 3723, 9986, 5799, 4368, 5407, 6649, 4440, 2449, 8929, 3931, 8572, 897, 1183, 8700, 6302,
                                4220, 7079, 606, 1997, 3320, 3972, 1665, 7040, 5498, 183, 9913, 7578, 7960, 2693, 7350, 2695, 4119, 8687,
                                9768, 9750, 3194, 8094, 4217, 2685, 517, 5405, 643, 8330, 709, 5094, 1785, 7373, 9959, 9744, 8258, 9817,
                                9125, 2108, 2399, 2829, 7452, 7959, 7445, 691, 8593, 2607, 9654, 6818, 1229, 9627, 8351, 6534, 2638,
                                1404, 4351, 5570, 2592, 2449, 6346, 9682, 8385, 3301, 3446, 9827, 3892, 7905, 7993, 9453, 9130, 3539,
                                1329, 5509, 1480, 3923, 4281, 2023, 2831, 4094, 325, 2525, 298, 4585, 1504, 9083, 8083, 2549, 8935, 6434,
                                8693, 8390, 8946, 3759, 6957, 1920, 9872, 3330, 2548, 7869, 9895, 4396, 3427, 9233, 3454, 8025, 1223,
                                645, 2683, 839, 6973, 6312, 3088, 6144, 5787, 4069, 7490, 6861, 8064, 3078, 6062, 29, 8112, 9105, 9435,
                                6905, 1194, 7444, 2481, 375, 7504, 8987, 5733, 6958, 8267, 8278, 6778, 6425, 566, 2751, 9991, 4960, 5293,
                                6992, 9922, 7566, 4263, 5549, 1869, 3827, 6242, 9912, 3500, 2993, 89, 2724, 4124, 6707, 9892, 6036, 9428,
                                1764, 1366, 7572, 7006, 6514, 6895, 5714, 501, 6816, 2610, 8596, 6374, 8250, 1172, 8538, 7761, 4758,
                                4823, 5837, 4523, 9108, 6070, 9439, 3384, 6145, 1840, 3848, 1181, 9191, 7958, 1016, 4590, 2825, 9447,
                                6935, 6521, 3495, 1705, 8347, 62, 4941, 9374, 5294, 3799, 3905, 1225, 3139, 4678, 2254, 2912, 4717, 6936,
                                4152, 2818, 4106, 7612, 9055, 7652, 8776, 2090, 5871, 507, 510, 9518, 103, 4866, 745, 8437, 4663, 8084,
                                8304, 1019, 6603, 1102, 4566, 9744, 5208, 8751, 4109, 7437, 7145, 6275, 7022, 4829, 855, 9119, 547, 8207,
                                2321, 481, 9566, 6055, 8689, 370, 1331, 4270, 6673, 7286, 7907, 1837, 5802, 2954, 4798, 345, 8622, 7509,
                                6777, 2609
                        }},
                        new Object[]{105, 2521}, new Object[]{577, 1522, 4860}, new Object[]{537, 736, 786},
                        new Object[]{271, 751, 5424}, new Object[]{3699, 1787}, new Object[]{618, 264, 4576}, new Object[]{359, 9799},
                        new Object[]{745, 1872}, new Object[]{544, 254, 2431}, new Object[]{105, 506, 8013}, new Object[]{316, 3418},
                        new Object[]{159, 2086}, new Object[]{7110, 4636}, new Object[]{163, 750}, new Object[]{555, 437, 5182},
                        new Object[]{574, 9525}, new Object[]{157, 16, 6920}, new Object[]{438, 7096}, new Object[]{73, 110, 5373},
                        new Object[]{450, 9750}, new Object[]{723, 5896}, new Object[]{234, 663, 4644}, new Object[]{29, 2422},
                        new Object[]{578, 2788}, new Object[]{36, 79}, new Object[]{6617, 8457}, new Object[]{43, 381, 1204},
                        new Object[]{717, 1248}, new Object[]{388, 7963}, new Object[]{6928, 509, 7737}, new Object[]{269, 3335},
                        new Object[]{418, 4941}, new Object[]{415, 8507}, new Object[]{229, 441, 2502}, new Object[]{576, 4194},
                        new Object[]{537, 3530}, new Object[]{303, 8354}, new Object[]{300, 4481}, new Object[]{536, 5215},
                        new Object[]{2428, 3520}, new Object[]{4008, 305}, new Object[]{100, 3090}, new Object[]{713, 728, 6266},
                        new Object[]{607, 1494}, new Object[]{5, 108, 6353}, new Object[]{3088, 317}, new Object[]{139, 252, 5342},
                        new Object[]{577, 586, 8540}, new Object[]{661, 2707}, new Object[]{181, 485, 4610}, new Object[]{551, 669, 1966},
                        new Object[]{1366, 3623}, new Object[]{528, 408}, new Object[]{346, 544, 8159}, new Object[]{410, 4866, 5453},
                        new Object[]{4628, 8709}, new Object[]{739, 8710}, new Object[]{2205, 3037}, new Object[]{195, 654, 1413},
                        new Object[]{216, 310, 5510}, new Object[]{5331, 5770}, new Object[]{2024, 7988}, new Object[]{227, 4206},
                        new Object[]{339, 259, 2664}, new Object[]{294, 9499}, new Object[]{300, 3357}, new Object[]{435, 4028},
                        new Object[]{297, 6820}, new Object[]{287, 6946}, new Object[]{2428, 367, 7941}, new Object[]{45, 533, 9400},
                        new Object[]{5576, 13, 9574}, new Object[]{162, 488, 4542}, new Object[]{1212, 1233}, new Object[]{482, 1242},
                        new Object[]{242, 2394}, new Object[]{120, 823}, new Object[]{65, 6326}, new Object[]{160, 9970},
                        new Object[]{306, 8084}, new Object[]{138, 138}, new Object[]{580, 574, 6087}, new Object[]{3209, 6697},
                        new Object[]{371, 4400}, new Object[]{410, 5786}, new Object[]{443, 4679}, new Object[]{84, 2782},
                        new Object[]{302, 106, 3966}, new Object[]{678, 4355}, new Object[]{449, 6200}, new Object[]{172, 55, 2458},
                        new Object[]{2002, 517, 8581}, new Object[]{284, 655, 9687}, new Object[]{27, 317, 4065}, new Object[]{631, 5980},
                        new Object[]{7392, 200, 8164}, new Object[]{3569, 3316}, new Object[]{295, 1383}, new Object[]{419, 9239},
                        new Object[]{711, 5521, 4137}, new Object[]{684, 6161}, new Object[]{180, 5872}, new Object[]{331, 864},
                        new Object[]{493, 6746}, new Object[]{22, 903}, new Object[]{124, 3401}, new Object[]{386, 713, 2501},
                        new Object[]{624, 2737}, new Object[]{183, 384, 2133}, new Object[]{173, 113}, new Object[]{1741, 8860},
                        new Object[]{2683, 6035}, new Object[]{200, 2087, 4027}, new Object[]{526, 334, 9027}, new Object[]{546, 668, 9897},
                        new Object[]{263, 473}, new Object[]{445, 2789}, new Object[]{535, 3877}, new Object[]{148, 4441},
                        new Object[]{230, 2964}, new Object[]{594, 4193}, new Object[]{171, 172, 4597}, new Object[]{221, 26, 1830},
                        new Object[]{76, 1442}, new Object[]{361, 176, 9552}, new Object[]{250, 1000}, new Object[]{649, 682, 1004},
                        new Object[]{2315, 2519}, new Object[]{416, 295, 1823}, new Object[]{123, 3106, 5544}, new Object[]{212, 4779},
                        new Object[]{757, 4703}, new Object[]{697, 167, 8776}, new Object[]{7198, 2348}, new Object[]{584, 124},
                        new Object[]{692, 8668}, new Object[]{495, 7826}, new Object[]{647, 1906, 1553}, new Object[]{895, 468},
                        new Object[]{228, 5485}, new Object[]{174, 401, 4937}, new Object[]{322, 1594}, new Object[]{609, 716, 8212},
                        new Object[]{415, 7837}, new Object[]{168, 8504}, new Object[]{77, 219, 5177}, new Object[]{127, 8890},
                        new Object[]{721, 2164}, new Object[]{522, 8999}, new Object[]{412, 8933}, new Object[]{309, 205, 1855},
                        new Object[]{252, 668, 7980}, new Object[]{140, 4189}, new Object[]{464, 20, 9853}, new Object[]{699, 484, 6697},
                        new Object[]{740, 169, 4991}, new Object[]{518, 5520, 5300}, new Object[]{624, 5403}, new Object[]{405, 2494},
                        new Object[]{7308, 1643}, new Object[]{209, 459, 3939}, new Object[]{725, 337, 5402}, new Object[]{714, 9814},
                        new Object[]{453, 3080}, new Object[]{389, 2620}, new Object[]{570, 497}, new Object[]{450, 5995},
                        new Object[]{476, 749, 7669}, new Object[]{4764, 381, 1599}, new Object[]{708, 8506}, new Object[]{433, 289, 6414},
                        new Object[]{255, 6, 8361}, new Object[]{584, 201, 8241}, new Object[]{422, 1375}, new Object[]{562, 479, 928},
                        new Object[]{232, 1642}, new Object[]{139, 775}, new Object[]{6438, 8845}, new Object[]{372, 148, 5504},
                        new Object[]{684, 8918}, new Object[]{6127, 379, 5584}, new Object[]{41, 3253}, new Object[]{630, 8987},
                        new Object[]{561, 3281}, new Object[]{235, 262}, new Object[]{513, 2626}, new Object[]{28, 356, 7169},
                        new Object[]{39, 9406}, new Object[]{535, 3530}, new Object[]{230, 3681}, new Object[]{561, 3269},
                        new Object[]{291, 4699}, new Object[]{278, 6823}, new Object[]{680, 7782}, new Object[]{4370, 9209},
                        new Object[]{159, 3316}, new Object[]{721, 9690}, new Object[]{489, 424, 4622}, new Object[]{580, 587, 7448},
                        new Object[]{288, 9348}, new Object[]{184, 482, 2772}, new Object[]{442, 1308}, new Object[]{441, 157, 7970},
                        new Object[]{326, 15, 4755}, new Object[]{24, 8155}, new Object[]{470, 2203}, new Object[]{3771, 650, 3844},
                        new Object[]{2900, 201, 6523}, new Object[]{650, 4571, 6258}, new Object[]{34, 2888}, new Object[]{442, 705, 54},
                        new Object[]{422, 72}, new Object[]{91, 138, 6743}, new Object[]{681, 9547}, new Object[]{169, 385},
                        new Object[]{482, 208, 2682}, new Object[]{383, 9970}, new Object[]{433, 516, 413}, new Object[]{684, 171, 1656},
                        new Object[]{718, 67}, new Object[]{6193, 488, 7165}, new Object[]{552, 2415}, new Object[]{172, 79, 3665},
                        new Object[]{25, 7459}, new Object[]{709, 3386}, new Object[]{752, 223, 6550}, new Object[]{1667, 3231},
                        new Object[]{150, 2522}, new Object[]{391, 4435}, new Object[]{283, 356, 3037}, new Object[]{530, 2749},
                        new Object[]{1095, 433, 7743}, new Object[]{117, 492, 4348}, new Object[]{27, 3484}, new Object[]{3369, 52, 5683},
                        new Object[]{709, 9325}, new Object[]{689, 6085}, new Object[]{6290, 189, 1415}, new Object[]{102, 3198},
                        new Object[]{10, 2009}, new Object[]{125, 740, 8766}, new Object[]{244, 185, 5227}, new Object[]{549, 9273},
                        new Object[]{259, 4881}, new Object[]{489, 1520}, new Object[]{243, 2585}, new Object[]{651, 599, 1374},
                        new Object[]{243, 2564}, new Object[]{459, 4245}, new Object[]{540, 3649}, new Object[]{308, 724, 1518},
                        new Object[]{615, 186}, new Object[]{2014, 601, 1581}, new Object[]{689, 9416}, new Object[]{743, 616, 8179},
                        new Object[]{7302, 357, 4397}, new Object[]{55, 117, 3141}, new Object[]{5898, 6685}, new Object[]{663, 515, 2602},
                        new Object[]{1, 586}, new Object[]{251, 19, 1229}, new Object[]{338, 9584}, new Object[]{421, 648, 3121},
                        new Object[]{103, 6697}, new Object[]{428, 1139, 1847}, new Object[]{253, 6165}, new Object[]{239, 877},
                        new Object[]{288, 523, 4221}, new Object[]{449, 697, 3316}, new Object[]{51, 8014}, new Object[]{1118, 667, 4519},
                        new Object[]{747, 3908}, new Object[]{74, 2034}, new Object[]{226, 511, 1870}, new Object[]{6030, 8622},
                        new Object[]{352, 264, 7412}, new Object[]{519, 231, 6898}, new Object[]{676, 3839}, new Object[]{385, 824},
                        new Object[]{271, 1228}, new Object[]{300, 413, 7271}, new Object[]{549, 593}, new Object[]{584, 7050},
                        new Object[]{157, 321, 109}, new Object[]{5771, 6178}
                },
                new Object[]{null, true, false, true, true, false, false, false, false, true, false, true, true, false, true, true,
                        false, false, true, true, true, true, false, true, true, true, false, true, false, true, false, false,
                        true, true, false, true, false, false, true, true, false, false, true, false, true, false, false, true,
                        false, true, false, true, false, true, false, false, false, false, false, false, false, false, false, true,
                        true, false, true, false, false, true, false, false, false, true, false, true, false, true, false, false,
                        true, true, true, false, false, false, true, true, true, true, true, false, false, false, false, true,
                        false, false, true, false, false, true, true, true, true, true, false, false, true, true, true, false,
                        false, false, false, false, true, true, false, false, true, false, false, true, true, false, true, true,
                        false, true, false, false, true, false, false, true, true, false, false, false, false, true, true, false,
                        true, true, true, true, true, true, false, false, true, true, false, false, false, false, true, true,
                        false, true, false, false, true, true, true, true, true, false, false, false, false, false, true, true,
                        true, true, false, true, true, false, true, true, true, true, true, false, false, true, true, false, true,
                        true, true, false, false, true, false, false, false, true, true, false, false, true, true, false, false,
                        false, true, true, true, false, true, false, true, false, true, true, true, false, true, false, true, true,
                        false, false, true, true, true, true, false, true, true, false, false, true, false, false, true, false,
                        true, true, true, false, true, true, false, true, false, false, true, false, true, true, false, true,
                        false, true, true, true, true, false, false, false, false, true, false, true, true, false, true, true,
                        true, false, true, true, true, false, true, true, true, true, true, false}
        );
    }
}
