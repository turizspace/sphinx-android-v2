package chat.sphinx.concept_repository_connect_manager.model

import chat.sphinx.example.wrapper_mqtt.TribeMembersResponse

sealed class ConnectionManagerState {

    data class OwnerRegistered(val isRestoreAccount: Boolean) : ConnectionManagerState()
    data class MnemonicWords(val words: String): ConnectionManagerState()
    data class UserState(val userState: String): ConnectionManagerState()
    data class NetworkMixerIp(val mixerIp: String): ConnectionManagerState()
    data class TribeServerIp(val tribeIp: String): ConnectionManagerState()

    data class DeleteUserState(val userState: List<String>): ConnectionManagerState()
    data class SignedChallenge(val authToken: String): ConnectionManagerState()
    data class TribeMembersList(val tribeMembers: TribeMembersResponse): ConnectionManagerState()
    data class NewInviteCode(val inviteCode: String): ConnectionManagerState()
}
