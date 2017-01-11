/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import {
  TouchableHighlight,
  AppRegistry,
  StyleSheet,
  Text,
  View,
  NativeModules,
  requireNativeComponent,
} from 'react-native';

var MarketContainerModule = NativeModules.MarketContainerModule;
var ViewPager =  requireNativeComponent('MarketContainerView', null);

export default class test extends Component {

  onPress() {
    MarketContainerModule.openNewActivity();
  }

  render() {
    return <ViewPager />
  }

  // render() {
  //   return (
  //     <View style={styles.container}>
  //       <TouchableHighlight onPress={this.onPress.bind(this)}>
  //         <Text style={styles.welcome}>
  //           Welcome to React Native!
  //       </Text>
  //       </TouchableHighlight>
  //       <Text style={styles.instructions}>
  //         To get started, edit index.ios.js
  //       </Text>
  //       <Text style={styles.instructions}>
  //         Press Cmd+R to reload,{'\n'}
  //         Cmd+D or shake for dev menu
  //       </Text>
  //     </View>
  //   );
  // }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
  welcome: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
  instructions: {
    textAlign: 'center',
    color: '#333333',
    marginBottom: 5,
  },
});

AppRegistry.registerComponent('test', () => test);
