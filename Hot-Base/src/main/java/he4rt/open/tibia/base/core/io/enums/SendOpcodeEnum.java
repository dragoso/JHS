package he4rt.open.tibia.base.core.io.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum SendOpcodeEnum implements IEnums {

    DEFAULT(-1000),


    SEND_DEFAULT(-1000),
    SEND_NOTYPE(0),
    SEND_PENDING_STATE_ENTERED(10),
    SEND_ENTER_WORLD(15),
    SEND_FIRSTS(23),
    SEND_CLIENT_CHECK(99),
    SEND_MAP_DESCRIPTION(100),
    SEND_WORLDLIGHT(130),
    SEND_TIBIA_TIME(239),
    SEND_PING(29),
    SEND_PING_BACK(30),
    SEND_SELFAPPEAR(10),
    SEND_PLAYERMODES(167),
    SEND_DISCONNECT(20),
    SEND_ADDUNKNOWNCREATURE(97),
    SEND_ADDKNOWNCREATURE(98),
    SEND_MAPSLICENORTH(101),
    SEND_MAPSLICEEAST(102),
    SEND_MAPSLICESOUTH(103),
    SEND_MAPSLICEWEST(104),
    SEND_TILEUPDATE(105),
    SEND_ADDATSTACKPOS(106),
    SEND_TRANSFORMTHING(107),
    SEND_REMOVEATSTACKPOS(108),
    SEND_CREATUREMOVED(109),
    SEND_CONTAINEROPEN(110),
    SEND_CONTAINERCLOSE(111),
    SEND_CONTAINERADDITEM(112),
    SEND_CONTAINERUPDATEITEM(113),
    SEND_CONTAINERREMOVEITEM(114),
    SEND_INVENTORYITEM(120),
    SEND_INVENTORYEMPTY(121),
    SEND_OPENSHOP(122),
    SEND_SALEITEMLIST(123),
    SEND_MAGICEFFECT(131),
    SEND_ANIMATEDTEXT(132),
    SEND_DISTANCESHOOTEFFECT(133),
    SEND_PLAYERWALKCANCEL(181),
    SEND_CREATURELIGHT(141),
    SEND_CREATUREHEALTH(140),
    SEND_CREATUREOUTFIT(142),
    SEND_CREATURESKULL(144),
    SEND_CREATUREEMBLEM(145),
    SEND_PLAYERSTATUS(160),
    SEND_PLAYERSKILLS(161),
    SEND_PLAYERCONDITIONS(162),
    SEND_CREATURESPEECH(170),
    SEND_CANCELTARGET(163),
    SEND_TEXTMESSAGE(180),
    SEND_FLOORCHANGEUP(190),
    SEND_FLOORCHANGEDOWN(191),
    SEND_OUTFITWINDOW(200),
    SEND_RELOGINWINDOW(40),
    SEND_CHANGESPEED(143),
    SEND_OPENCHANNEL(172),
    SEND_OPENPRIVATECHANNEL(173),
    SEND_SENDPRIVATEMESSAGE(170),
    SEND_CHANNELLIST(171),
    SEND_CLOSECHANNEL(179),
    SEND_ADDVIP(210),
    SEND_ONLINESTATUSVIP(211),
    SEND_OFFLINESTATUSVIP(212),
    SEND_TEXTWINDOW(150),

    ;

    private int value;

    public static SendOpcodeEnum getByIntegerValue(int opCode) {

        return Arrays.stream(SendOpcodeEnum.values()).filter(e -> e.getValue() == opCode).findFirst().orElse(DEFAULT);

    }
}
